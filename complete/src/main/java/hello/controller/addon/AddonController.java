package hello.controller.addon;

import hello.model.addonmodel.addon.Addon;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class AddonController {

    private final AddonRepository repository;

    AddonController(AddonRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/addons")
    List<Addon> all() {
        return repository.findAll();
    }

    @PostMapping("/addon/new")
    Addon newAddon(@RequestBody Addon addon) {
        return repository.save(addon);
    }

    // Single item

    @GetMapping("/addon/{id}/details")
    Addon one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new AddonNotFoundException(id));
    }

    @PutMapping("/addon/{id}/edit")
    Addon replaceAddon(@RequestBody Addon addon, @PathVariable Long id) {
        return repository.findById(id)
                .map(newAddon -> {
                    newAddon.setName(addon.getName());
                    newAddon.setAddonId(addon.getAddonId());
                    newAddon.setInvoiceName(addon.getInvoiceName());
                    newAddon.setDescription(addon.getDescription());
                    newAddon.setPrice(addon.getPrice());
                    newAddon.setChargeType(addon.getChargeType());
                    newAddon.setAddonType(addon.getAddonType());
                    return repository.save(newAddon);
                })
                .orElseGet(() -> {
                    return repository.save(addon);
                });
    }
    @DeleteMapping("/addon/{id}")
    void deleteAddon(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
