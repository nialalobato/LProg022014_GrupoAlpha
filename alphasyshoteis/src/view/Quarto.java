/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Alain
 */
@Entity
@Table(name = "quarto", catalog = "dbalphahoteis", schema = "")
@NamedQueries({
    @NamedQuery(name = "Quarto.findAll", query = "SELECT q FROM Quarto q"),
    @NamedQuery(name = "Quarto.findByIdQuarto", query = "SELECT q FROM Quarto q WHERE q.idQuarto = :idQuarto"),
    @NamedQuery(name = "Quarto.findByNumeroQuarto", query = "SELECT q FROM Quarto q WHERE q.numeroQuarto = :numeroQuarto"),
    @NamedQuery(name = "Quarto.findByTipoQuarto", query = "SELECT q FROM Quarto q WHERE q.tipoQuarto = :tipoQuarto"),
    @NamedQuery(name = "Quarto.findByValorQuarto", query = "SELECT q FROM Quarto q WHERE q.valorQuarto = :valorQuarto")})
public class Quarto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_quarto")
    private Integer idQuarto;
    @Column(name = "numero_quarto")
    private String numeroQuarto;
    @Column(name = "tipo_quarto")
    private String tipoQuarto;
    @Column(name = "valor_quarto")
    private String valorQuarto;

    public Quarto() {
    }

    public Quarto(Integer idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Integer getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Integer idQuarto) {
        Integer oldIdQuarto = this.idQuarto;
        this.idQuarto = idQuarto;
        changeSupport.firePropertyChange("idQuarto", oldIdQuarto, idQuarto);
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(String numeroQuarto) {
        String oldNumeroQuarto = this.numeroQuarto;
        this.numeroQuarto = numeroQuarto;
        changeSupport.firePropertyChange("numeroQuarto", oldNumeroQuarto, numeroQuarto);
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        String oldTipoQuarto = this.tipoQuarto;
        this.tipoQuarto = tipoQuarto;
        changeSupport.firePropertyChange("tipoQuarto", oldTipoQuarto, tipoQuarto);
    }

    public String getValorQuarto() {
        return valorQuarto;
    }

    public void setValorQuarto(String valorQuarto) {
        String oldValorQuarto = this.valorQuarto;
        this.valorQuarto = valorQuarto;
        changeSupport.firePropertyChange("valorQuarto", oldValorQuarto, valorQuarto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQuarto != null ? idQuarto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quarto)) {
            return false;
        }
        Quarto other = (Quarto) object;
        if ((this.idQuarto == null && other.idQuarto != null) || (this.idQuarto != null && !this.idQuarto.equals(other.idQuarto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Quarto[ idQuarto=" + idQuarto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
