package com.example.streamdbdata.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.core.DatabaseClient

@Configuration
class DbConfig(databaseClient: DatabaseClient) {
    init {
        val initDb = databaseClient.execute {
            """ CREATE TABLE IF NOT EXISTS profile (
                    id SERIAL PRIMARY KEY,
                    first_name varchar(255) NOT NULL,
                    last_name varchar(255) NOT NULL
                );
            """
        }
        initDb.then().subscribe()
    }
}
