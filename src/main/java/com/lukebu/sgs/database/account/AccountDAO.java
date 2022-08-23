package com.lukebu.sgs.database.account;

import com.lukebu.sgs.database.IAccountDAO;
import com.lukebu.sgs.model.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
public class AccountDAO implements IAccountDAO {

    @Autowired
    Connection connection;

    @Override
    public Optional<Account> getUserByLogin(String accountName) {
        try {
            String sql = "SELECT * FROM SGS_USERS WHERE login = ?";

            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setString(1, accountName);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return Optional.of(new Account(
                        resultSet.getInt("ACC_ID"),
                        resultSet.getString("ACC_NAME"),
                        resultSet.getInt("ACC_AVATAR_ID"),
                        resultSet.getString("ACC_COUNTRY_CODE"),
                        resultSet.getString("ACC_EMAIL"),
                        resultSet.getString("ACC_PASSWORD")
                        ));
            }

            return Optional.empty();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
