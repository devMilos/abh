package services;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * The type Administrator service.
 */
@Singleton
public class AdministratorService extends BaseService {

	@Inject
	private AdministratorService() { }

	public Long getNumberOfRestaurants() {
		return Long.valueOf(getSession().createCriteria(Restaurant.class)
				.setProjection(Projections.rowCount())
				.uniqueResult().toString());
	}

	

}
