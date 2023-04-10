import { Entities, createEntities } from "@ssougnez/ng-store";
import { User } from "../models/user.model"

export type AppState = {
  users: Entities<User>;
}

export const initial: AppState = {
  users: createEntities()
}