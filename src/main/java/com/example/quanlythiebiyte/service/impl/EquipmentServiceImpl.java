package com.example.quanlythiebiyte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quanlythiebiyte.entity.Equipment;
import com.example.quanlythiebiyte.repository.EquipmentRepository;
import com.example.quanlythiebiyte.service.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentRepository equipmentRepository;
	
	@Override
	public Iterable<Equipment> findAll() {
		return equipmentRepository.findAll();
	}

	@Override
	public Equipment findOne(long id) {
		return equipmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Equipment not found"));
	}

	@Override
	public Equipment create(Equipment equipment) {
		return equipmentRepository.save(equipment);
	}

	@Override
	public void delete(long id) {
		equipmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Equipment not found"));        
		equipmentRepository.deleteById(id);
	}

	@Override
	public Equipment updateEquipment(Equipment equipment, long id) {
		if (equipment.getEquipmentID() != id) {          
			throw new RuntimeException("ID not match");
		}
		equipmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Equipment not found"));
        return equipmentRepository.save(equipment);

	}

}
