package com.app.operations;

import com.app.models.Organization;
import com.app.repository.JsonDataRepository;
import com.app.repository.Repository;

public class OrganizationOperations {
    public String perform(String term,String value) {
        Repository repository = new JsonDataRepository();
        Organization organization = repository.getOrganization(term,value);

        String result=organization.toString();

        return result;
    }
}
