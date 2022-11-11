package gerenciadordejogos.model.interaction;

import gerenciadordejogos.model.user.User;

/**
 *
 * @author gabriel
 */
abstract public class Interaction {
    private static Integer count = 0, lastId = 0;
    private Integer id, ownerId;
    
    Interaction(User owner){
        this.id = Interaction.lastId++;
        this.ownerId = owner.getId();
    }
}
