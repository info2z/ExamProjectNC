package ExamProjectNC.server.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ExamProjectNC.shared.model.Examined;
import ExamProjectNC.shared.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("ExaminedDAO")
public class ExaminedDAO extends AbstractJpaDAO<Long, Examined> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }

    @Override
    @Transactional
    protected Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }

}
