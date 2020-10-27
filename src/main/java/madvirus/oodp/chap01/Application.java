package madvirus.oodp.chap01;

public class Application implements OnClickListener {

    private Menu menu1 = new Menu("menu1");
    private Menu menu2 = new Menu("menu2");
    private Button button1 = new Button("button1");

    private ScreenUI currentScreen = null;

    public Application() {
        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void clicked(Component eventSource) {
        if (eventSource.getId().equals("menu1")) {
            currentScreen = new Menu1ScreenUI();
            currentScreen.show();
        } else if (eventSource.getId().equals("menu2")) {
            currentScreen = new Menu2ScreenUI();
            currentScreen.show();
        } else if (eventSource.getId().equals("button1")) {
            if (currentScreen == null)
                return;
            // 현재 메뉴에 상관없이 버튼1에 대해 처리한다.
            currentScreen.handleButton1Click();
        }
    }
}
