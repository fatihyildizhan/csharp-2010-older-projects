<%@ Page Language="C#" MasterPageFile="~/sayfalar/ziyaretci/ziyaretciPaneli.master"
    AutoEventWireup="true" CodeFile="index.aspx.cs" Inherits="sayfalar_ziyaretci_index"
    Title="Turan Oto Emlak 2010 | Anasayfa" %>

<%@ Register Src="../ziyaretciWuc/EmlakARA_Menu.ascx" TagName="EmlakARA_Menu" TagPrefix="uc1" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="Server">
    <link rel="stylesheet" type="text/css" href="../../shadowbox/shadowbox.css" />

    <script type="text/javascript" src="../../shadowbox/shadowbox.js"></script>

    <script type="text/javascript">
        Shadowbox.init();
    </script>

</asp:Content>
<asp:Content ID="Content2" runat="server" ContentPlaceHolderID="ContentPlaceHolder1">
    <uc1:EmlakARA_Menu ID="EmlakARA_Menu1" runat="server" />
</asp:Content>
<asp:Content ID="Content3" runat="server" ContentPlaceHolderID="ContentPlaceHolder3">
    <div id="divSlideDesk">
        <div class="divClear">
        </div>
        <div id="slidedeck_frame">
            <dl class="slidedeck">
                <dt>Turan Emlak Oto HAKKIMIZDA</dt>
                <dd>
                    1974 y�l�nda halen bulundu�u yerde hizmet vermeye ba�layan Turan Emlak Oto tamam�yla
                    bir aile �irketi olup, altyap�s�n� G�VEN�L�RL�K ve D�R�STL�K �zerine kurmu�tur.
                    Amac�m�z % 100 M��TER� MEMNUN�YET�, politikam�z B�R M��TER� B�N M��TER� politikas�d�r.
                    �htiyac�n�z oldu�unda hizmetinizdeyiz. Daima �al��ma dileklerimizle ...
                </dd>
                <dt>Hizmetlerimiz</dt>
                <dd>
                    Turan Emlak Oto bir�ok semtte KONUT kiralamaktad�r. Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz
                    Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz
                    Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz
                    Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz
                    Turan Emlak Oto bir�ok semtte KONUT kiralamaktad�r. Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz
                    Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz
                    Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz Hizmetlerimiz HizmetlerimizHizmetlerimizHizmetlerimiz
                </dd>
                <dt>Ekibimiz</dt>
                <dd>
                    Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz
                    Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz
                    Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz
                    Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz
                    Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz Ekibimiz
                    Ekibimiz Ekibimiz Ekibimiz Ekibimiz Turan Emlak Oto bir�ok semtte ARSA kiralamaktad�r.</dd>
                <dt>Referanslar�m�z</dt>
                <dd>
                    Turan Emlak Oto bir�ok semtte ��YER� kiralamaktad�r.</dd>
                <dt>B�lgesel Bilgi</dt>
                <dd>
                    Turan Emlak Oto bir�ok semtte YAZLIK kiralamaktad�r.</dd>
                <dt>Haritalar</dt>
                <dd>
                    Turan Emlak Oto bir�ok semtte DEVREM�LK kiralamaktad�r.</dd>
                <dt>Linkler</dt>
                <dd>
                    Turan Emlak Oto bir�ok semtte B�NA kiralamaktad�r.</dd>
            </dl>
        </div>

        <script type="text/javascript">
            $('.slidedeck').slidedeck();
        </script>

        <div class="divClear">
        </div>
    </div>
</asp:Content>
