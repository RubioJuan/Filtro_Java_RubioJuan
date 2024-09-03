/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Ninja;
import Dao.NinjaDao;
import View.NinjaView;

import java.util.List;

/**
 *
 * @author camper
 */

public class NinjaController {
     private NinjaDao ninjaDao;
    private NinjaView ninjaView;

    // Constructor que acepta el DAO y la Vista
    public NinjaController(NinjaDao ninjaDao, NinjaView ninjaView) {
        this.ninjaDao = ninjaDao;
        this.ninjaView = ninjaView;
    }

    public boolean isEventNameExists(String nombre) {
        List<Ninja> ninjas = ninjaDao.ViewNinja();
        for (Ninja ninja : ninjas) {
            if (ninja.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public List<Ninja> getAllNinja() {
        return ninjaDao.ViewNinja();
    }

    public boolean AddNinja(Ninja ninja) {
        return ninjaDao.InsertNinja(ninja);
    }
}
