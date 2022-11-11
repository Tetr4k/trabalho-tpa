/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadordejogos.model.user;

import gerenciadordejogos.model.Game;
import gerenciadordejogos.model.interaction.Interaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author gabriel
 */
public class User {
    private static Integer count = 0, lastId = 0;
    private Integer id;
    private String nickname, email;
    private ArrayList<String> log;
    private ArrayList<Interaction> interactions;
    private ArrayList<User> friends;
    private HashMap<Integer, Date> library;
    
    User(String nickname, String email){
        User.count++;
        this.id = User.lastId++;
        this.nickname = nickname;
        this.email = email;
        this.log = new ArrayList<String>();
        this.interactions = new ArrayList<Interaction>();
        this.friends = new ArrayList<User>();
        this.library = new HashMap<Integer, Date>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public ArrayList<String> getLog() {
        return this.log;
    }

    public ArrayList<Interaction> getInteractions() {
        return this.interactions;
    }
    
    public HashMap<Integer, Date> getGames() {
        return this.library;
    }
    
    public void addInteraction(Interaction interaction) {
        this.interactions.add(interaction);
    }
    
    public void addGame(Game game) {
        this.library.put(game.getId(), new Date());
    }
}
