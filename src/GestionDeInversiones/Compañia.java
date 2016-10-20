package GestionDeInversiones;

import java.util.ArrayList;
import java.util.HashMap;


public class Compañia {
    private HashMap<String, Cliente> clientes;
    
    public Compañia(){
       this.clientes = new HashMap<>();
    }
    
    public boolean addClient(Cliente cliente){
       return true;
    }
    
    public double calAmountAllMarket(){
      return 0;
    }
    
    public double calAllProfit(){
      return 0;
    }
    
    public ArrayList calMarketAndProfitByAsset(){
      return null;
    }
    public ArrayList calMarketAndProfitByAge(){
      return null;
    }
    
    public Cliente calClientMaxProfit(){
       return null;
    }
    
    public ArrayList listClient(){
      return null;
    }
}