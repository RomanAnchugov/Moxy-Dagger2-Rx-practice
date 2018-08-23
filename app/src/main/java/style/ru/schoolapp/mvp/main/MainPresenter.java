package style.ru.schoolapp.mvp.main;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import ru.terrakok.cicerone.Router;
import style.ru.schoolapp.MainActivity;
import style.ru.schoolapp.Screens;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private Router router;

    public MainPresenter(Router router) {
        this.router = router;
    }

    public void onCreateActivity(MainActivity activity){
       router.navigateTo(Screens.ALL_COURSES_SCREEN);
    }
}