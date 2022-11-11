package gerenciadordejogos;

import static gerenciadordejogos.utils.AudioUtils.beep;
import gerenciadordejogos.view.LoadingView;
import gerenciadordejogos.view.LoginView;

/**
 *
 * @author gabriel
 */
public class GerenciadorDeJogos {
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    
    public static void main(String[] args) throws InterruptedException { 
        LoadingView loadingView = new LoadingView();
        loadingView.setVisible(true);
        beep();
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(15);
            loadingView.LoadingProgess.setValue(i);
            loadingView.labelPercentage.setText(i+"%");
        }
        loadingView.dispose();
        new LoginView().setVisible(true);
        beep();
    }
    
}
