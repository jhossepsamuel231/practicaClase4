package com.example.practicCuatro.dao;

import java.util.List;

public interface Todo<T> {
	List<T> readAll();
}
