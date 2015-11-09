-(void) playSoundFile:(NSSound*)sound iterations:(int)numIterations
{
  for (int i=0; i<numIterations; i++)
  {
    [sound play];
  }
}

-(void) troll
{
  NSSound* sound = [NSSound soundNamed:@"pikachu"];
  [self playSoundFile:sound iterations:1000];
}

-(void) yolo
{
  [self troll];
}

