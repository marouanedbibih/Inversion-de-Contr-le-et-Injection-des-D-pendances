package org.marouanedbibih.metier;

import org.marouanedbibih.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    // @Qualifier("dao3")
    private IDao dao;

    public double calcul() {
        return dao.getValue() * 2;
    }


    public IDao getDao() {
        return dao;
    }
    
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
