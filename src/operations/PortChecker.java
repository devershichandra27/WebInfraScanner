/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author batman
 */
public class PortChecker 
{
    public static boolean portCheck(String host, int port) throws IOException
    {
        Socket s = null;
        try
        {
            s = new Socket(host, port);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        finally
        {
            if (s!=null)
            {
                try
                {
                    s.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        
    }
}