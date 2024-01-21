package org.example.Interface;

public interface Interfaces {

    //seutilizanporlogeneral para comunicrse con la base de datos

    //nose puede crear objetos directamente

    // atrbutos constructores enclasesabstracts - van por las carateristicass

    // las interfaces VAN maspor el comportamento

    // atributos podemos crarlos ejemplo --las variables deberian ir en mayudula

    int MAXIMO_DATOS = 10;

    //COMOPORTAMENTOS EN COMUN DE BASES DE DATOS

    // CRUD

    void insertar(); // son metodosaabstractos no´pueden modififarse sise pueden crear privados ejempli
    void  listar(); // son metodosaabstractos no
    void  actualizar(); // son metodosaabstractos no
    void borrar(); // son metodosaabstract


    // pensar aca mas en los comportamientos que pueden heredar

    //private
   /* default insert(){

    }*/
}
