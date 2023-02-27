package cv.mentex.mgserver.config;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.sql.Connection;
import java.util.Locale;

// @Component
public class Migrate {

    private JdbcTemplate db;

    public Migrate(JdbcTemplate db){
        this.db = db;
        // Run Migration herC:\Users\adalbertom\Documents\private\minigit\mg-server\src\main
        System.out.println("Estou send executado!");
        try {
            Path rootPath = Path.of(System.getProperty("user.dir"));
            Path dbScriptPath = rootPath.resolve("dbscript").resolve("MainDB.sql");
            System.out.println(dbScriptPath);
            File fl = new File(dbScriptPath.toString());
            Connection con = db.getDataSource().getConnection();
            if (fl.isFile()){
                // Ficheiro de migração localizado
                // System.getProperties().list(System.out);
                String osvendor = System.getProperty("os.name");
                if (osvendor.toLowerCase(Locale.ROOT).contains("windows")){
                    ScriptRunner sr = new ScriptRunner(con);
                    Reader reader = new BufferedReader(new FileReader(dbScriptPath.toString()));
                    sr.runScript(reader);
                }else {
                    ScriptRunner sr = new ScriptRunner(con);
                    Reader reader = new BufferedReader(new FileReader(dbScriptPath.toString()));
                    sr.runScript(reader);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            new AnnotationConfigReactiveWebApplicationContext().close();
            System.exit(0);
        }
    }
}
