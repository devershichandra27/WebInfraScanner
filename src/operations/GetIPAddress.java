/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author batman
 */
public class GetIPAddress 
{
    public static String getIPAddress(String website) throws UnknownHostException
    {
        InetAddress in = InetAddress.getByName(website);
        return in.getHostAddress();
    }
}
