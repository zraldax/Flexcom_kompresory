/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.BranchData;
import dao.Pobocka_DAO;
import dao.StrojData;
import dao.Stroj_DAO;
import dao.Zakaznik_DAO;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
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
    private BranchData branch;
    private JLabel t1,t2,t3,t4,t5,t6,customername,branchname,branchexecutives,branchmobile,branchemail;
    public MachinePanel(int machineId,int branchId,int customerId) {
        branchAcces = new  Pobocka_DAO();
        machineAcess = new Stroj_DAO();
        customerAcess = new Zakaznik_DAO();
        machine = machineAcess.getStrojData(machineId);
        branch = branchAcces.getBranch(branchId);
        t1 = new JLabel(machine.name);
        t2 = new JLabel(machine.kod);
        t3 = new JLabel(machine.objednaciCislo);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
        String strDate = formatter.format(machine.rokVyroby);  
        t4 = new JLabel(strDate);
        if(machine.revizovat){
            t5 = new JLabel("Revizováno");
        }else{
            t5 = new JLabel("Nerevizováno");
        }
        
        t6 = new JLabel(machine.name);
        customername = new JLabel(customerAcess.getName(customerId));
        branchname = new JLabel(branch.name);
        branchexecutives = new JLabel(branch.branchExecutives);
        branchemail = new JLabel(branch.email);
        branchmobile = new JLabel(branch.mob);
                
    }
    
}
