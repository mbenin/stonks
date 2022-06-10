package dev.mrbenin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.mrbenin.stonks.enums.EntradaSaidaEnum;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{

    private static final Logger LOG = LoggerFactory.getLogger(App.class);         

  
    public static void main( String[] args )
    {
        LOG.info("Iniciando a aplicação");
        SpringApplication.run(App.class, args);
        LOG.info("Final da aplicação");
    }
    
    
    @Override
    public void run(String... args) throws Exception {
        /*String file = "/mnt/c/Users/mbeni/OneDrive/Documentos/Investimentos/movimentacao-01112019-31102020.xlsx";
        B3Service b3service = new B3Service();
        b3service.obterOperacoesFii(file);*/
        System.out.println(EntradaSaidaEnum.valueByField("Debito"));
    }

}
