/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;

/**
 *
 * @author Cooler
 */
public class StrojData {  
    public  final String vyrobniCislo;  
    public  final String kod;  
    public  final String name;
    private final int strojTypeIdstrojType;  
    private final int pobockaIdpobocka;  
    private final String objednaciCislo;  
    private final boolean revizovat;   
    private final Date rokVyroby;
    private final String poznamka;

    public StrojData(String vyrobniCislo, String kod, String name, int strojTypeIdstrojType, int pobockaIdpobocka, String objednaciCislo, boolean revizovat, Date rokVyroby, String poznamka) {
        this.vyrobniCislo = vyrobniCislo;
        this.kod = kod;
        this.name = name;
        this.strojTypeIdstrojType = strojTypeIdstrojType;
        this.pobockaIdpobocka = pobockaIdpobocka;
        this.objednaciCislo = objednaciCislo;
        this.revizovat = revizovat;
        this.rokVyroby = rokVyroby;
        this.poznamka = poznamka;
    }
    
}
