import { registerPlugin } from '@capacitor/core';

import type { MyBackgroundServicePlugin } from './definitions';

const MyBackgroundService = registerPlugin<MyBackgroundServicePlugin>('MyBackgroundService', {
  web: () => import('./web').then(m => new m.MyBackgroundServiceWeb()),
});

export * from './definitions';
export { MyBackgroundService };
