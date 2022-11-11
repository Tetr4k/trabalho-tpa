package gerenciadordejogos.model;

/**
 *
 * @author gabriel
 */
public class Settings {
    private static Settings settings = new Settings();
    private Integer volume;
    
    private Settings(){
        this.volume = 100;
    }
    
    public static Settings getInstance(){
        return Settings.settings;
    }
    
    public Integer getVolume(){
        return this.volume;
    }
    
    public void setVolume(Integer volume){
        this.volume = volume;
    }
}
