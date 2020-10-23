package com.example.quanlythiebiyte.service;


import com.example.quanlythiebiyte.entity.Equipment;

public interface EquipmentService {
	public Iterable<Equipment> findAll();
	public Equipment findOne(long id);
	public Equipment create(Equipment equipment);
	public void delete(long id);
	public Equipment updateEquipment(Equipment equipment, long id);
}
