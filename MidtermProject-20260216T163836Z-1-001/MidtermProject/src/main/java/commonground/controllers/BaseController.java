package commonground.controllers;

import commonground.DbUserRepository;
import commonground.SceneRouter;

public interface BaseController {
    void init(SceneRouter router, DbUserRepository db);
}
