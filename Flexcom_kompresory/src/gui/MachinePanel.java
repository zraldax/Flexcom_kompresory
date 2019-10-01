/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.Pobocka_DAO;
import dao.StrojData;
import dao.Stroj_DAO;
import dao.Zakaznik_DAO;
import javax.swing.JPanel;

/**
 *
 * @author Pt
 */
public class MachinePanel extends JPanel{
    private Pobocka_DAO branchAcces;
    private Stroj_DAO machineAcess;
    private Zakaznik_DAO customerAcess;
    private StrojData machine;
    public MachinePanel(int machineId,int branchId,int CustomerId) {
        branchAcces = new  Pobocka_DAO();
        machineAcess = new Stroj_DAO();
        customerAcess = new Zakaznik_DAO();
        machine = machineAcess.getStrojData(machineId);
    }
    
}
