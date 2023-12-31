package es.unican.appriegospersonales.activities.riesgos;

import static android.content.ContentValues.TAG;

import android.util.Log;

import java.util.List;

import es.unican.appriegospersonales.model.Riesgo;
import es.unican.appriegospersonales.repository.db.DaoSession;
import es.unican.appriegospersonales.repository.db.RiesgoDao;

public class RiesgosPresenter implements IRiesgosContract.Presenter {

    private final IRiesgosContract.View view;
    private RiesgoDao riesgoDao;

    public RiesgosPresenter(IRiesgosContract.View view) {
        this.view = view;
    }

    @Override
    public void init() {
        DaoSession daoSession = view.getMyApplication().getDaoSession();
        riesgoDao = daoSession.getRiesgoDao();
    }

    @Override
    public List<Riesgo> getRiesgos() {
        return riesgoDao.loadAll();
    }
}
