export interface MyBackgroundServicePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
