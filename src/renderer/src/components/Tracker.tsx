import { Input, Button, Divider } from '@heroui/react';
import PlayIcon from './icons/PlayIcon';
import TrackingItems from '@renderer/services/data';

function Tracker(): JSX.Element {
  return (
    <div className="tracker w-full bg-zinc-950 border-r-1 border-zinc-700 z-10 shadow-xl shadow-zinc-950 pt-4">
      <div className="flex nowrap gap-4 justify-center items-center mx-4">
        <Input label="What are you tracking?" size="sm" fullWidth={false} className="w-full" />
        <div className="inline-block ml-1">
          <Button isIconOnly radius="full" size="md">
            <PlayIcon fill="none" classes="w-5 h-5" />
          </Button>
        </div>
      </div>
      <div className="flex mx-4 justify-center items-center">
        <Divider className="my-6 w-full" />
      </div>
      <div className="flex flex-col ml-4 gap-4">
        {TrackingItems.map((item) => (
          <div key={item} className="flex gap-4 justify-left items-center">
            <Button isIconOnly radius="full" size="sm">
              <PlayIcon fill="none" classes="w-4 h-4" />
            </Button>
            <span>{item}</span>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Tracker;
