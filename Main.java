import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;

public class Main {
    public static void main(String[] args){
        ApiContextInitializer.init();
        DefaultBotOptions botOptions= ApiContext.getInstance(DefaultBotOptions.class);

        botOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);
        botOptions.setProxyHost("localhot");
        botOptions.setProxyPort(9150);

        p44ogodBot P44ogodBot =new p44ogodBot(botOptions);
        TelegramBotsApi bostApi=new TelegramBotsApi();

        try{
            bostApi.registerBot(P44ogodBot);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
