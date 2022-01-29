import React from 'react';
import Photo from './Photo';

function Posts(photoList: Array<string>) {
    return (
        <div>
            {photoList.map((photoData: string, i: number) => (
                <Photo photoData={photoData}></Photo>
            ))}
        </div>
    )
}

export default Posts;