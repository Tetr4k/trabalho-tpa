/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadordejogos.dao;

import java.io.File;

/**
 *
 * @author gabriel
 */
public class SettingsDAO {
    private float volume;
    
    public SettingsDAO(){
        File settingsFile = new File("settings.cfg");
        //Le arquivo
        
        this.volume = 100;
    }
}
