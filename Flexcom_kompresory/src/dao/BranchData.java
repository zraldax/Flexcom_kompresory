/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Pt
 */
public class BranchData {
    final public String branchExecutives;
    final public String name;
    final public String email;
    final public String mob;

    public BranchData(String branchExecutives, String name, String email, String mob) {
        this.branchExecutives = branchExecutives;
        this.name = name;
        this.email = email;
        this.mob = mob;
    }
    
}
