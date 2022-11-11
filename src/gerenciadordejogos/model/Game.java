package gerenciadordejogos.model;
import java.util.Date;
/**
 *
 * @author gabriel
 */
public class Game {
    private static Integer count = 0, lastId = 0;
    private Integer id, downloads;
    private String name, developer;
    private Date release;
    
    Game(String name, String developer, Date release) {
        Game.count++;
        this.id = Game.lastId++;
        this.name = name;
        this.developer = developer;
        this.release = release;
    }

    public static Integer getCount() {
        return count;
    }
    
    public Integer getId() {
        return this.id;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public Date getRelease() {
        return release;
    }
}
