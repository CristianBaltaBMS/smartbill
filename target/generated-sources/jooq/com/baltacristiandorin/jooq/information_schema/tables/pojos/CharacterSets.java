/*
 * This file is generated by jOOQ.
 */
package com.baltacristiandorin.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterSets implements Serializable {

    private static final long serialVersionUID = 1L;

    private String characterSetCatalog;
    private String characterSetSchema;
    private String characterSetName;
    private String characterRepertoire;
    private String formOfUse;
    private String defaultCollateCatalog;
    private String defaultCollateSchema;
    private String defaultCollateName;

    public CharacterSets() {}

    public CharacterSets(CharacterSets value) {
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.characterRepertoire = value.characterRepertoire;
        this.formOfUse = value.formOfUse;
        this.defaultCollateCatalog = value.defaultCollateCatalog;
        this.defaultCollateSchema = value.defaultCollateSchema;
        this.defaultCollateName = value.defaultCollateName;
    }

    public CharacterSets(
        String characterSetCatalog,
        String characterSetSchema,
        String characterSetName,
        String characterRepertoire,
        String formOfUse,
        String defaultCollateCatalog,
        String defaultCollateSchema,
        String defaultCollateName
    ) {
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.characterRepertoire = characterRepertoire;
        this.formOfUse = formOfUse;
        this.defaultCollateCatalog = defaultCollateCatalog;
        this.defaultCollateSchema = defaultCollateSchema;
        this.defaultCollateName = defaultCollateName;
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_set_name</code>.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    public String getCharacterRepertoire() {
        return this.characterRepertoire;
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.character_repertoire</code>.
     */
    public void setCharacterRepertoire(String characterRepertoire) {
        this.characterRepertoire = characterRepertoire;
    }

    /**
     * Getter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public String getFormOfUse() {
        return this.formOfUse;
    }

    /**
     * Setter for <code>information_schema.character_sets.form_of_use</code>.
     */
    public void setFormOfUse(String formOfUse) {
        this.formOfUse = formOfUse;
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public String getDefaultCollateCatalog() {
        return this.defaultCollateCatalog;
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public void setDefaultCollateCatalog(String defaultCollateCatalog) {
        this.defaultCollateCatalog = defaultCollateCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public String getDefaultCollateSchema() {
        return this.defaultCollateSchema;
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public void setDefaultCollateSchema(String defaultCollateSchema) {
        this.defaultCollateSchema = defaultCollateSchema;
    }

    /**
     * Getter for
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    public String getDefaultCollateName() {
        return this.defaultCollateName;
    }

    /**
     * Setter for
     * <code>information_schema.character_sets.default_collate_name</code>.
     */
    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CharacterSets other = (CharacterSets) obj;
        if (this.characterSetCatalog == null) {
            if (other.characterSetCatalog != null)
                return false;
        }
        else if (!this.characterSetCatalog.equals(other.characterSetCatalog))
            return false;
        if (this.characterSetSchema == null) {
            if (other.characterSetSchema != null)
                return false;
        }
        else if (!this.characterSetSchema.equals(other.characterSetSchema))
            return false;
        if (this.characterSetName == null) {
            if (other.characterSetName != null)
                return false;
        }
        else if (!this.characterSetName.equals(other.characterSetName))
            return false;
        if (this.characterRepertoire == null) {
            if (other.characterRepertoire != null)
                return false;
        }
        else if (!this.characterRepertoire.equals(other.characterRepertoire))
            return false;
        if (this.formOfUse == null) {
            if (other.formOfUse != null)
                return false;
        }
        else if (!this.formOfUse.equals(other.formOfUse))
            return false;
        if (this.defaultCollateCatalog == null) {
            if (other.defaultCollateCatalog != null)
                return false;
        }
        else if (!this.defaultCollateCatalog.equals(other.defaultCollateCatalog))
            return false;
        if (this.defaultCollateSchema == null) {
            if (other.defaultCollateSchema != null)
                return false;
        }
        else if (!this.defaultCollateSchema.equals(other.defaultCollateSchema))
            return false;
        if (this.defaultCollateName == null) {
            if (other.defaultCollateName != null)
                return false;
        }
        else if (!this.defaultCollateName.equals(other.defaultCollateName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.characterSetCatalog == null) ? 0 : this.characterSetCatalog.hashCode());
        result = prime * result + ((this.characterSetSchema == null) ? 0 : this.characterSetSchema.hashCode());
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        result = prime * result + ((this.characterRepertoire == null) ? 0 : this.characterRepertoire.hashCode());
        result = prime * result + ((this.formOfUse == null) ? 0 : this.formOfUse.hashCode());
        result = prime * result + ((this.defaultCollateCatalog == null) ? 0 : this.defaultCollateCatalog.hashCode());
        result = prime * result + ((this.defaultCollateSchema == null) ? 0 : this.defaultCollateSchema.hashCode());
        result = prime * result + ((this.defaultCollateName == null) ? 0 : this.defaultCollateName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CharacterSets (");

        sb.append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(characterRepertoire);
        sb.append(", ").append(formOfUse);
        sb.append(", ").append(defaultCollateCatalog);
        sb.append(", ").append(defaultCollateSchema);
        sb.append(", ").append(defaultCollateName);

        sb.append(")");
        return sb.toString();
    }
}
