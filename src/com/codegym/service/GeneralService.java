package com.codegym.service;


public interface GeneralService<T> {
    T[] showList();

    int size();

    boolean addProduct(int index, T element);

    void removeProduct(int index);

    T setProduct(int index, T element);

    int findByName(String elementName);
    T[] sortByPrice();
}
