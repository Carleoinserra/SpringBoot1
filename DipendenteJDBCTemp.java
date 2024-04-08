package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DipendenteJDBCTemp {
    
	
    private JdbcTemplate jdbcTemplateObject;

    @Autowired
    public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
        this.jdbcTemplateObject = jdbcTemplateObject;
    }

    public int insertDipendente(String cognome, String mansione, double stipendio) {
        String query = "INSERT INTO Dipendente (cognome, mansione, stipendio) VALUES (?, ?, ?)";
        return jdbcTemplateObject.update(query, cognome, mansione, stipendio);
    }

    public int updateCognome(int id, String cognome) {
        String query = "UPDATE Dipendente SET cognome = ? WHERE id = ?";
        return jdbcTemplateObject.update(query, cognome, id);
    }

    public int updateMansione(int id, String mansione) {
        String query = "UPDATE Dipendente SET mansione = ? WHERE id = ?";
        return jdbcTemplateObject.update(query, mansione, id);
    }

    public int updateStipendio(int id, double stipendio) {
        String query = "UPDATE Dipendente SET stipendio = ? WHERE id = ?";
        return jdbcTemplateObject.update(query, stipendio, id);
    }

    public int deleteDipendente(int id) {
        String query = "DELETE FROM Dipendente WHERE id = ?";
        return jdbcTemplateObject.update(query, id);
    }

    // Metodo per eseguire query DDL
    public void executeDDLQuery(String query) {
        jdbcTemplateObject.execute(query);
    }
}
