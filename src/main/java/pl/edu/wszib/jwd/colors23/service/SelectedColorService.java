package pl.edu.wszib.jwd.colors23.service;

import pl.edu.wszib.jwd.colors23.model.SelectedColor;

import java.util.List;

public interface SelectedColorService {
    void save(String color);
    void save(SelectedColor selectedColor);
    List<SelectedColor> getAllData();
}
