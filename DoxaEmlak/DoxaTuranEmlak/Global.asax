﻿<%@ Application Language="C#" %>

<script runat="server">

    void Application_Start(object sender, EventArgs e) 
    {
        // Code that runs on application startup

    }
    
    void Application_End(object sender, EventArgs e) 
    {
        //  Code that runs on application shutdown

    }
        
    void Application_Error(object sender, EventArgs e) 
    {
        try
        {
            System.Net.Mail.SmtpClient smtp = new System.Net.Mail.SmtpClient("", 587);
            System.Net.Mail.MailAddress sndr = new System.Net.Mail.MailAddress("");
            System.Net.Mail.MailAddress receiver = new System.Net.Mail.MailAddress("", "");
            string zaman = DateTime.Now.ToLongTimeString();
            string hata = "hata";
            if (Server.GetLastError().InnerException != null) { hata = Server.GetLastError().InnerException.Message; }

            System.Net.Mail.MailMessage mail = new System.Net.Mail.MailMessage(sndr, receiver);
            mail.Subject = "Application Error: Turan EMLAK OTO ";
            mail.Body = "HATA OLUŞMA ZAMANI : " + zaman + " <br/><br/><br/> " + " <br/><br/><br/> YARDIMCI LİNK : " + Server.GetLastError().HelpLink + " <br/><br/><br/> OLUŞAN SON HATA : " + Server.GetLastError().ToString() + " <br/><br/> Inner Exception : " + hata + "  <br/><br/><br/> Son Oluşan Hata'nın Data Bilgisi : " + Server.GetLastError().Data.ToString();
            mail.BodyEncoding = Encoding.Default;
            mail.IsBodyHtml = true;
            mail.Priority = System.Net.Mail.MailPriority.Normal;
            smtp.Send(mail);
        }
        catch (Exception)
        {
        }

    }

    void Session_Start(object sender, EventArgs e) 
    {
        // Code that runs when a new session is started

    }

    void Session_End(object sender, EventArgs e) 
    {
        // Code that runs when a session ends. 
        // Note: The Session_End event is raised only when the sessionstate mode
        // is set to InProc in the Web.config file. If session mode is set to StateServer 
        // or SQLServer, the event is not raised.
    }
       
</script>
