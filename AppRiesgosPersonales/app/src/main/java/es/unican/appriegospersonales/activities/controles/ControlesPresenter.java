package es.unican.appriegospersonales.activities.controles;

import java.util.List;

import es.unican.appriegospersonales.model.Control;
import es.unican.appriegospersonales.model.Perfil;
import es.unican.appriegospersonales.repository.db.ControlDao;
import es.unican.appriegospersonales.repository.db.DaoSession;
import es.unican.appriegospersonales.repository.db.PerfilDao;

public class ControlesPresenter implements IControlesContract.Presenter {
    private final IControlesContract.View view;
    private ControlDao controlDao;
    private PerfilDao perfilDao;

    public ControlesPresenter(IControlesContract.View view) {
        this.view = view;
    }

    @Override
    public void init() {
        DaoSession daoSession = view.getMyApplication().getDaoSession();
        controlDao = daoSession.getControlDao();
        perfilDao = daoSession.getPerfilDao();
    }

    @Override
    public List<Control> getControles() {
        return controlDao.loadAll();
    }

    @Override
    public List<Control> getPerfilControls() {
        Perfil perfil = Perfil.getInstance(perfilDao);
        return perfil.getControlesAnhadidas();
    }
}
