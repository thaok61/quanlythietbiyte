package com.example.quanlythiebiyte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.quanlythiebiyte.entity.Equipment;
import com.example.quanlythiebiyte.service.EquipmentService;
import com.example.quanlythiebiyte.service.impl.EquipmentServiceImpl;

@RestController
@RequestMapping("/api/equipments")
public class EquipmentController {
	@Autowired
	private EquipmentService equipmentService;
	
	@GetMapping
	public Iterable findAll() {
		return equipmentService.findAll();
	}
	
	@GetMapping("/{id}")
	public Equipment findOne(@PathVariable Long id) {
		return equipmentService.findOne(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Equipment create(@RequestBody Equipment equipment) {
		return equipmentService.create(equipment);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		equipmentService.delete(id);
	}
	
	@PutMapping("/{id}")
	public Equipment updateEquipment(@RequestBody Equipment equipment, @PathVariable Long id) {
		return equipmentService.updateEquipment(equipment, id);
	}
}
