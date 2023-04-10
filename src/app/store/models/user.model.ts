import { BaseEntity } from "@ssougnez/ng-store";

export type User = BaseEntity<number> & {
  id: number,
  firstname: string,
  lastname: string
}