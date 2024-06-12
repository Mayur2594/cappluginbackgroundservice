import { WebPlugin } from '@capacitor/core';

import type { MyBackgroundServicePlugin } from './definitions';

export class MyBackgroundServiceWeb extends WebPlugin implements MyBackgroundServicePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
