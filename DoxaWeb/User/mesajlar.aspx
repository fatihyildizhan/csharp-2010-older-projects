<%@ Page Title="" Language="C#" MasterPageFile="~/User/MasterPageUyeler.master" AutoEventWireup="true" CodeFile="mesajlar.aspx.cs" Inherits="User_mesajlar" ValidateRequest="true" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        .style7
        {
            width: 100%;
        }
        .style8
        {
            width: 109px;
        }
    .style9
    {
        width: 119px;
    }
    </style>
</asp:Content>


<asp:Content ID="Content7" runat="server" 
    contentplaceholderid="ContentPlaceHolder4">

                      <div>
                      
                          <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" 
                              BackColor="White" BorderColor="#3366CC" BorderStyle="None" BorderWidth="1px" 
                              CellPadding="4" Height="113px" Width="524px" AllowPaging="True" 
                              onpageindexchanging="GridView1_PageIndexChanging" 
                              onrowcommand="GridView1_RowCommand" onrowdatabound="GridView1_RowDataBound" 
                              ShowFooter="True" PageSize="5">
                              <RowStyle BackColor="White" ForeColor="#003399" />
                              <Columns>
                                  <asp:TemplateField>
                                      <ItemTemplate>
                                          <asp:CheckBox ID="CheckBox1" runat="server" />
                                      </ItemTemplate>
                                      <HeaderTemplate>
                                          <asp:CheckBox ID="CheckBox2" runat="server" Text="Seç" />
                                      </HeaderTemplate>
                                  </asp:TemplateField>
                                  <asp:TemplateField HeaderText="Gönderen">
                                      <ItemTemplate>
                                          <asp:Label ID="Label5" runat="server" Text='<%# Bind("Kimden") %>'></asp:Label>
                                      </ItemTemplate>
                                  </asp:TemplateField>
                                  <asp:TemplateField HeaderText="G. E-Posta">
                                      <ItemTemplate>
                                          <asp:Label ID="Label6" runat="server" Text='<%# Bind("Mail") %>'></asp:Label>
                                      </ItemTemplate>
                                  </asp:TemplateField>
                                  <asp:TemplateField HeaderText="Konu">
                                      <ItemTemplate>
                                          <asp:LinkButton ID="LinkButton1" runat="server" 
                                              CommandArgument='<%# Bind("MesajId") %>' Text='<%# Bind("Konu") %>' 
                                              CommandName="MesajGor"></asp:LinkButton>
                                      </ItemTemplate>
                                  </asp:TemplateField>
                                  <asp:TemplateField HeaderText="Mesaj Tarihi">
                                      <ItemTemplate>
                                          <asp:Label ID="Label8" runat="server" Text='<%# Bind("Tarih") %>'></asp:Label>
                                      </ItemTemplate>
                                  </asp:TemplateField>
                                  <asp:TemplateField HeaderText="Okundumu">
                                      <ItemTemplate>
                                          <asp:Image ID="Image1" runat="server" ImageUrl='<%# Bind("Resim") %>' />
                                      </ItemTemplate>
                                  </asp:TemplateField>
                              </Columns>
                              <FooterStyle BackColor="#99CCCC" ForeColor="#003399" />
                              <PagerStyle BackColor="#99CCCC" ForeColor="#003399" HorizontalAlign="Left" />
                              <SelectedRowStyle BackColor="#009999" Font-Bold="True" ForeColor="#CCFF99" />
                              <HeaderStyle BackColor="#003399" Font-Bold="True" ForeColor="#CCCCFF" />
                          </asp:GridView>
                          <asp:GridView ID="GridView2" runat="server" AllowPaging="True" 
                              AutoGenerateColumns="False" BackColor="White" BorderColor="#3366CC" 
                              BorderStyle="None" BorderWidth="1px" CellPadding="4" PageSize="1" 
                              Visible="False" Width="519px">
                              <RowStyle BackColor="White" ForeColor="#003399" />
                              <Columns>
                                  <asp:TemplateField>
                                      <ItemTemplate>
                                          <table class="style7">
                                              <tr>
                                                  <td class="style9">
                                                      Gönderen:</td>
                                                  <td>
                                                      <asp:Label ID="Label9" runat="server" Text='<%# Bind("Kimden") %>'></asp:Label>
                                                  </td>
                                              </tr>
                                              <tr>
                                                  <td class="style9">
                                                      Gönderen E-Posta:</td>
                                                  <td>
                                                      <asp:Label ID="Label10" runat="server" Text='<%# Bind("Mail") %>'></asp:Label>
                                                  </td>
                                              </tr>
                                              <tr>
                                                  <td class="style9">
                                                      Konu:</td>
                                                  <td>
                                                      <asp:Label ID="Label11" runat="server" Text='<%# Bind("Konu") %>'></asp:Label>
                                                  </td>
                                              </tr>
                                              <tr>
                                                  <td class="style9">
                                                      Mesaj Tarihi:</td>
                                                  <td>
                                                      <asp:Label ID="Label12" runat="server" Text='<%# Bind("Tarih") %>'></asp:Label>
                                                  </td>
                                              </tr>
                                              <tr>
                                                  <td class="style9">
                                                      &nbsp;</td>
                                                  <td>
                                                      &nbsp;</td>
                                              </tr>
                                              <tr>
                                                  <td class="style9">
                                                      Mesaj:</td>
                                                  <td>
                                                      <asp:TextBox ID="TextBox1" runat="server" Height="70px" 
                                                          Text='<%# Bind("Mesaj") %>' Width="364px" CssClass="contact_input"></asp:TextBox>
                                                      <br />
                                                  </td>
                                              </tr>
                                          </table>
                                      </ItemTemplate>
                                  </asp:TemplateField>
                              </Columns>
                              <FooterStyle BackColor="#99CCCC" ForeColor="#003399" />
                              <PagerStyle BackColor="#99CCCC" ForeColor="#003399" HorizontalAlign="Left" />
                              <SelectedRowStyle BackColor="#009999" Font-Bold="True" ForeColor="#CCFF99" />
                              <HeaderStyle BackColor="#003399" Font-Bold="True" ForeColor="#CCCCFF" />
                          </asp:GridView>
                          <asp:Panel ID="Panel1" runat="server" Visible="False">
                              <table class="style7">
                                  <tr>
                                      <td class="style8">
                                          Kime:</td>
                                      <td>
                                          <asp:TextBox ID="txtKime" runat="server" CausesValidation="True" 
                                              CssClass="contact_input" MaxLength="50" Width="100px"></asp:TextBox>
                                          <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" 
                                              ValidationGroup="MesajGonder" ControlToValidate="txtKime">*</asp:RequiredFieldValidator>
                                      </td>
                                  </tr>
                                  <tr>
                                      <td class="style8">
                                          Konu:</td>
                                      <td>
                                          <asp:TextBox ID="txtKonu" runat="server" CausesValidation="True" 
                                              CssClass="contact_input" MaxLength="50" Width="100px"></asp:TextBox>
                                          <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" 
                                              ValidationGroup="MesajGonder" ControlToValidate="txtKonu">*</asp:RequiredFieldValidator>
                                      </td>
                                  </tr>
                                  <tr>
                                      <td class="style8">
                                          Mesaj:</td>
                                      <td>
                                          <asp:TextBox ID="txtMesaj" runat="server" Height="148px" TextMode="MultiLine" 
                                              Width="405px" CausesValidation="True" CssClass="contact_input"></asp:TextBox>
                                          <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" 
                                              ValidationGroup="MesajGonder" ControlToValidate="txtMesaj">*</asp:RequiredFieldValidator>
                                      </td>
                                  </tr>
                                  <tr>
                                      <td class="style8">
                                          <asp:Button ID="btnMesajGonder" runat="server" Text="Mesaj Gönder" 
                                              Width="102px" onclick="btnMesajGonder_Click" ValidationGroup="MesajGonder" />
                                      </td>
                                      <td>
                                          <asp:Label ID="lblMesajGonderSonuc" runat="server"></asp:Label>
                                      </td>
                                  </tr>
                              </table>
                          </asp:Panel>
                          <br />
                          <asp:Label ID="lblGidenKutusu" runat="server" Text="Yakında..." Visible="False"></asp:Label>
                          <br />
                          
                          <br />
                          <asp:Label ID="lblMesajYok" runat="server" Text="Gelen Kutusu Boş ..." 
                              Visible="False"></asp:Label>
                          <br />
                          <br />
                          <br />
                      
                          </div>
                      
</asp:Content>




<asp:Content ID="Content8" runat="server" contentplaceholderid="ContentPlaceHolder5">

                    <div class="sidenav">
			<h2>Mesaj Paneli</h2>
			<ul>
			    <li>
                    <asp:LinkButton ID="lbYenile" runat="server" onclick="lbYenile_Click">Yenile</asp:LinkButton>
                </li>
                <li>
                    <asp:LinkButton ID="lbGelenKutusu" runat="server" onclick="lbGelenKutusu_Click">Gelen Kutusu</asp:LinkButton>
                </li>
		        <li>
                    <asp:LinkButton ID="lbGidenKutusu" runat="server" onclick="lbGidenKutusu_Click">Giden Kutusu</asp:LinkButton>
                </li>
                 <li>
                    <asp:LinkButton ID="lbYeniMesaj" runat="server" onclick="lbYeniMesaj_Click">Yeni Mesaj</asp:LinkButton>
                </li>
		    </ul>
		    
			<h2>Üye Paneli</h2>
			<ul>
			<li>
                <asp:LoginName ID="LoginName1" runat="server" />
			</li>
				 <li>
                     <asp:LoginStatus ID="LoginStatus1" runat="server" LoginText="Giriş" 
                         LogoutText="Güvenli Çıkış" LogoutPageUrl="https://secure.fatihyildizhan.com/login.aspx" />
                 </li>
                <asp:LoginView ID="LoginView1" runat="server">
                    <RoleGroups>
                        <asp:RoleGroup Roles="Admin">
                            <ContentTemplate>
                                <li>
                                    <asp:HyperLink ID="HyperLink1" runat="server" 
                                        NavigateUrl="https://www.fatihyildizhan.com/User/userPanel.aspx" Width="104px">Profilim</asp:HyperLink>
                               </li>
                               <li>
                                   <asp:HyperLink ID="HyperLink3" runat="server" 
                                       NavigateUrl="https://www.fatihyildizhan.com/Management/adminPanel.aspx" Width="107px">Yönetim Paneli</asp:HyperLink>
                               </li>
                            </ContentTemplate>
                        </asp:RoleGroup>
                    </RoleGroups>
                    <LoggedInTemplate>
                        <li>
                            <asp:HyperLink ID="HyperLink2" runat="server" 
                                NavigateUrl="https://www.fatihyildizhan.com/User/userPanel.aspx" Width="97px">Profilim &gt;&gt;&gt;</asp:HyperLink></li>
                    </LoggedInTemplate>
                    <AnonymousTemplate>
                        <li>
                            <asp:HyperLink ID="HyperLink4" runat="server" NavigateUrl="~/sozlesme.aspx" 
                                Width="104px">Kayıt Ol &gt;&gt;&gt;</asp:HyperLink>
                        </li>
                    </AnonymousTemplate>
                </asp:LoginView>
			</ul>		
     </div>
                    
</asp:Content>





