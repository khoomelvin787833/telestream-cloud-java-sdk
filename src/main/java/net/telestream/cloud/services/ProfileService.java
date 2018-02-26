package net.telestream.cloud.services;

import com.google.gson.reflect.TypeToken;
import net.telestream.cloud.TelestreamCloudCredentials;
import net.telestream.cloud.TelestreamCloudRequest;
import net.telestream.cloud.objects.Profile;
import net.telestream.cloud.utils.GsonHelper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maciejwitowski on 1/23/16.
 */
public class ProfileService extends ApiService<Profile> {

    public static final Type TYPE_PROFILES_LIST = new TypeToken<List<Profile>>(){}.getType();
    public static final Type TYPE_PROFILE = new TypeToken<Profile>(){}.getType();

    public static final String PATH = "/profiles";

    private String factoryId;

    public ProfileService(TelestreamCloudCredentials credentials) {
        super(credentials);
    }

    public static ProfileService forFactory(TelestreamCloudCredentials credentials, String factoryId) {
        ProfileService profileService = new ProfileService(credentials);
        profileService.factoryId = factoryId;
        return profileService;
    }

    @Override
    public List<Profile> all() {
        int perPage = 100;
        List<Profile> allProfiles = new ArrayList<Profile>();

        List<Profile> profiles;
        int page = 1;
        do {
            profiles = all(page, perPage);
            allProfiles.addAll(profiles);
            page++;
        } while(profiles.size() == perPage);

        return allProfiles;
    }

    @Override
    String path() {
        return PATH;
    }

    @Override
    Type itemType() {
        return TYPE_PROFILE;
    }

    @Override
    Type collectionType() {
        return TYPE_PROFILES_LIST;
    }

    @Override
    void setAdditionalAllRequestParams(TelestreamCloudRequest.Builder builder) {
        if(factoryId != null) {
            builder.factoryId(factoryId);
        }
    }

    public Profile save(Profile profile) {
        TelestreamCloudRequest request = new TelestreamCloudRequest.Builder(credentials)
                .put()
                .apiPath(pathWithId(profile.getId()))
                .data(profile.getAttributesMap())
                .build();

        return GsonHelper.get().fromJson(request.send(), TYPE_PROFILE);
    }
}
