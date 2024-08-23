package com.example.customermanagementexceptionhandler.service;

import com.example.customermanagementexceptionhandler.exception.DuplicateEmailException;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t) throws DuplicateEmailException;

    T findById(Long id);

    void remove(Long id);
}
