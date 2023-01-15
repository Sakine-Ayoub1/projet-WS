<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <h3>RIB : <xsl:value-of select="releve/@rib"></xsl:value-of></h3>
                <h3>Date du releve : <xsl:value-of select="releve/dateReleve"></xsl:value-of></h3>
                <h3>Montant : <xsl:value-of select="releve/solde"></xsl:value-of></h3>
                <h3>Date debut des operations : <xsl:value-of select="releve/operations/@dateDebut"></xsl:value-of></h3>
                <h3>Date fin des operations : <xsl:value-of select="releve/operations/@dateFin"></xsl:value-of></h3>
                
             
                    <table border="1" width="80%">
                        <tr>
                            <th>Type</th> <th>Date</th> <th>Montant</th> <th>Description</th> 
                        </tr>
                        <xsl:for-each select="releve/operations/operation">
                        <tr>
                            <td><xsl:value-of select="@type"></xsl:value-of></td>
                            <td><xsl:value-of select="@date"></xsl:value-of></td>
                            <td><xsl:value-of select="@montant"></xsl:value-of></td>
                            <td><xsl:value-of select="@description"></xsl:value-of></td>
                        </tr>
                        </xsl:for-each>
                       
                    </table>
                
                <tr>
                    <td>Somme debit : <xsl:value-of select="sum(releve/operations/operation[@type='debit']/@montant)"></xsl:value-of></td> </tr> <br></br>
                    
                <tr>
                    <td>Somme credit : <xsl:value-of select="sum(releve/operations/operation[@type='credit']/@montant)"></xsl:value-of></td>
                </tr>
                
            </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>