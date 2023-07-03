package gr.aueb.cf.dao;

import gr.aueb.cf.model.Account;

public class AccountDAOImpl extends AbstractDAO<Account> implements IAccountDAO {

    public AccountDAOImpl() {
        this.setPersistentClass(Account.class);
    }
}
