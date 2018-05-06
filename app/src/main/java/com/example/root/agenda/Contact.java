package com.example.root.agenda;

public class Contact
{
    private String Nombre;
    private String Telefono;
    private String Estado;
    private int Thumbnail;

    public Contact()
    {

    }

    public Contact(String nombre, String telefono, String estado, int thumbnail) {
        Nombre = nombre;
        Telefono = telefono;
        Estado = estado;
        Thumbnail = thumbnail;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
